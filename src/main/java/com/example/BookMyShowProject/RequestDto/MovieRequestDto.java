package com.example.BookMyShowProject.RequestDto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
@Builder
public class MovieRequestDto {

    @Column(nullable = false)
    private String name;

    private int duration;

    private Date releaseDate;





}
