package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import projection.GameMinProjection;

public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String ShortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        ShortDescription = entity.getShortDescription();
    }

    public GameMinDto(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getGameYear();
        imgUrl = projection.getImgUrl();
        ShortDescription = projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return ShortDescription;
    }
}
