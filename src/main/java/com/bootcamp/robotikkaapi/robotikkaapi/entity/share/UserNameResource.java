package com.bootcamp.robotikkaapi.robotikkaapi.entity.share;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Embeddable
public class UserNameResource {

    private String firstName;
    private String lastName;

}
