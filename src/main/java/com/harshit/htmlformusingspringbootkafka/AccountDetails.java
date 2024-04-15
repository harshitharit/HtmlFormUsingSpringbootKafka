package com.harshit.htmlformusingspringbootkafka;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="formdata")

public class AccountDetails {
    private String firstName;
    private String lastName;
    private Long accountNumber;
    private String permanentAddress;
    private String currentAddress;
    private String dateOfBirth;

    private Long mobileNumber;
}