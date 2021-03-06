package org.leibnizcenter.wetten;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import nl.wetten._schema.Work;
import nl.wetten.bwbng.wti.WetstechnischeInformatie;
import org.leibnizcenter.ResourceNotFoundException;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.io.InputStream;

/**
 * <p>Utility methods for works (laws on no particular date)</p>
 * Created by maarten on 4-11-15.
 */
public class Works {
    /**
     * @param bwbId BWB id for document
     * @return {@link Work} object representing this law
     * @throws IOException
     * @throws JAXBException
     */
    public static Work getWork(String bwbId) throws IOException, JAXBException {
        HttpUrl url = HttpUrl.parse(
                getWorkUrl(bwbId)
        );
        return getWork(url);
    }

    public static String getWorkUrl(String bwbId) {
        return Const.HTTPS_REPOSITORY_OFFICIELE_OVERHEIDSPUBLICATIES_NL_BWB + bwbId + "/manifest.xml";
    }


    public static Work getWork(HttpUrl url) throws IOException, JAXBException {
        return getWork(
                new Request.Builder().url(url).build()
        );
    }

    public static Work getWork(Request build) throws IOException, JAXBException {
        return getWork(build, new OkHttpClient());
    }

    public static Work getWork(Request request, OkHttpClient httpClient) throws IOException, JAXBException {
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            InputStream stream = response.body().byteStream();
            return Work.parse(stream);
        } else {
            throw new ResourceNotFoundException(request, response);
        }
    }

    public static WetstechnischeInformatie getWti(String bwbId) throws IOException, JAXBException {
        HttpUrl url = HttpUrl.parse(
                Const.HTTPS_REPOSITORY_OFFICIELE_OVERHEIDSPUBLICATIES_NL_BWB + bwbId + "/" + bwbId + ".WTI"
        );
        return getWti(url);
    }

    public static WetstechnischeInformatie getWti(HttpUrl url) throws IOException, JAXBException {
        return getWti(
                new Request.Builder().url(url).build()
        );
    }

    public static WetstechnischeInformatie getWti(Request request) throws IOException, JAXBException {
        OkHttpClient httpClient = new OkHttpClient();
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            InputStream stream = response.body().byteStream();
            return WetstechnischeInformatie.parse(stream);
        } else {
            throw new ResourceNotFoundException(request, response);
        }
    }
}
