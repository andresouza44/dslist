package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name= "tb_belonging")
public class Belonging {
    private Integer position;

    @EmbeddedId
    private BelongingPK id = new BelongingPK();


    public Belonging() {
    }

    public Belonging(Game game, GameList list,Integer position) {
        id.setGame(game);
        id.setGameList(list);
        this.position = position;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Belonging belonging = (Belonging) o;

        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

