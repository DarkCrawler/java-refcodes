package com.tags.models;

import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class SimpleGreetingModel {
   private long id;
   private String content;
   private String message;
}
