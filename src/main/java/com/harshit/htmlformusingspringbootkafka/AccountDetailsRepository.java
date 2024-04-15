package com.harshit.htmlformusingspringbootkafka;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailsRepository extends MongoRepository<AccountDetails , String>
        {
}
