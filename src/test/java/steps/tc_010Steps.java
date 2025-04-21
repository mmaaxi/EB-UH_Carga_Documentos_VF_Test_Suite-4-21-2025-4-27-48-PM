package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;
import static org.junit.Assert.*;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("the user is on the document upload page")
    public void the_user_is_on_the_document_upload_page() {
        page.navigateToUploadPage();
    }

    @When("the user tries to upload a document named {string} or with malicious content")
    public void the_user_tries_to_upload_a_document_named_or_with_malicious_content(String fileName) {
        page.uploadMaliciousDocument(fileName);
    }

    @Then("the system should validate and filter the input to prevent injection attacks")
    public void the_system_should_validate_and_filter_the_input_to_prevent_injection_attacks() {
        assertTrue(page.isDocumentUploadSafe());
    }

    @Then("the security log should record the event")
    public void the_security_log_should_record_the_event() {
        assertTrue(page.isEventLogged());
    }

    @Then("an alert should be generated for review")
    public void an_alert_should_be_generated_for_review() {
        assertTrue(page.isAlertGenerated());
    }
}