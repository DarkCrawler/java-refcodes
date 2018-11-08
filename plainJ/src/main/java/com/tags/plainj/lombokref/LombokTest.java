package com.tags.plainj.lombokref;

import lombok.Builder;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Builder(toBuilder = true)
@Accessors(fluent=true)
public class LombokTest {
   String name;
   Integer age;
}
