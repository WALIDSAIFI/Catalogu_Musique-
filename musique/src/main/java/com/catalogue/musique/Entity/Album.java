package com.catalogue.musique.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "albums")
public class Album {
    @Id
    private String id;
    private String titre;
    private String artiste;
    private Integer annee;

    @DBRef
    private List<Chanson> chansons;
}
