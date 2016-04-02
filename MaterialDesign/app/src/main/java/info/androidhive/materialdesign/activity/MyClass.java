package info.androidhive.materialdesign.activity;

/**
 * Created by Kaivalya on 02/04/2016.
 */

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Email;

import org.json.JSONArray;
import org.json.JSONObject;

public class MyClass {
    /**
     * This calls sends an email to one recipient.
     */
    public static void main(String[] args) throws MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("api key", "api secret");
        request = new MailjetRequest(Email.resource)
                .property(Email.FROMEMAIL, "studyingnow@outlook.com")
                .property(Email.FROMNAME, "GotFood?")
                .property(Email.SUBJECT, "What do ou need?")
                .property(Email.TEXTPART, "Dear hungry dormmate, welcome to Gotfood! May the food force be with you!")
                .property(Email.HTMLPART, "<h3>Dear hungry dormmate, welcome to Gotfood!</h3><br />May the food force be with you!")
                .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                                .put("Email", "passenger@mailjet.com")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}