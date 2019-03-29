package com.example.graphql.po;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Ocean Liang
 * @date 3/28/2019
 */
@Data
public class Article {
    @Id
    private String id;
    private String content;
    private Boolean isPublished;
}
