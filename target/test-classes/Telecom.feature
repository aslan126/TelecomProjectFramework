Feature:
#  @TC_1
#  Scenario: Verify Guru99 telecom
#    Given The user wants to see Guru demo site
#    Then The user wants to verify "Guru99 telecom" header


#  @TC_2
#  Scenario Outline: Verify that we can add customers
#    Given The user wants to see Guru demo site
#    When The user wants to add a customer
#    Then The user wants to verifyy "Add Customer" header
#    Then The user wants to enter background check as "<bCheck>"
#    Then The user wants to enter billing address as "<fName>" and "<lName>" and "<email>" and "<address>" and "<pNumber>"
#    And The wants to verify message as "Access Details to Guru99 Telecom"
#    Examples:
#      |bCheck  |fName |lName |email               |address     |pNumber |
#      |Done    |Joe   |Dave  |joedave@gmail.com   |10 fake st |11 fake st|
#      |Pending |Jason |Dave  |jason@gmail.com     |123456789  |789654123 |

    @TC_3
    Scenario: Verify Add Tariff Plan
    Given The user wants to see Guru demo site
    Then The user wants to Add Tariff Plan
    Then The user wants to verifyyy "Add Tariff Plan" header
    Then The user wants to Add Tariff Plan details as
  | MonthlyRental                   |10|
  | FreeLocalMinutes                |12|
  | FreeInternationalMinutes        |13|
  | FreeSMSPack                     |15|
  | LocalPerMinutesCharges          |18|
  | InternationalPerMinutesCharges  |25|
  | SMSPerCharge                    |28|
    And The user wants to submit
    Then The user wants to verify message as "Congratulation you add Tariff Plan"