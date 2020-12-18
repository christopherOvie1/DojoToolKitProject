Feature: Problematic Nested Test


  Scenario: To check that user is able to validate messages as user interacts with the tab

    Given user navigate to "https://dojotoolkit.org/reference-guide/1.9/dijit/layout/TabContainer-examples.html"
    When user clicks on Programmatic Nested tabs run button
    And user click "Tab 2" in the modal
    And user click "My 4th inner" text
    Then I validate the text message "Fusce sed orci magna, vitae aliquet quam"
    And user click "Tab 1"
    Then I validate the text message "Lorem ipsum dolor sit amet"
    And user click "My 2nd Inner" text
    Then I validate the text message "Consectetur adipiscing elit"
    And user click "Tab 2"
    And user click "My 3rd inner" text
    Then I validate the text message "Vivamus orci massa rhoncus a lacinia"
    And user click "Tab 3"
    Then I validate the text message "No sub tabs"



