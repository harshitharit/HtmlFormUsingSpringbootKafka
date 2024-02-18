package com.harshit.htmlformusingspringbootkafka;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDetails {
    @JsonProperty("fname")
    private String firstName;

    @JsonProperty("lname")
    private String lastName;

    @JsonProperty("accnum")
    private String accountNumber;

    @JsonProperty("paddress")
    private String permanentAddress;

    @JsonProperty("caddress")
    private String currentAddress;

    @JsonProperty("dob")
    private String dateOfBirth;

    @JsonProperty("idproof")
    private String idProof;

    @JsonProperty("details")
    private String details;
}