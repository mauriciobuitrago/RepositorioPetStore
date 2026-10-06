Feature: restful booker

  Background: Conect
    Given Park need connect to website

  @PostCreateUser
  Scenario: Create user
    When enter to info new user
    Then validation status OK

  @PostcreauteBooking
  Scenario: Create booking
    When Create booking
    Then Validation schema response

  @GetBooking
  Scenario: Get Booking
    When Get Booking
    Then Validation schema response GetBooking

  @PutBooking
  Scenario: Put Booking
    When put Booking
    Then Validation in additionalneeds "lunch"