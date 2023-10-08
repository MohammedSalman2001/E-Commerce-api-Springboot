package com.bootcamp.robotikkaapi.robotikkaapi.entity.share;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Embeddable
public class FileResource {
    private String directory;
    private String hash;
    private String resourceUrl;
    private String fileName;



}
