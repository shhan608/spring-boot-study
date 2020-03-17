package com.shhan608.web.dto;

import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest() {
        var name = "test";
        var amount = 1000;

        var dto = new HelloResponseDto(name, amount);

        System.out.println(dto.getName());
        System.out.println(dto.getAmount());
    }
}
