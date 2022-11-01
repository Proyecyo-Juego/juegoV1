package com.example.test.models.statusModels;

import com.example.test.models.CharacterModel;


public abstract class StatusModel {

    CharacterModel charModel;

    public StatusModel(CharacterModel cardModel) {
        this.charModel = charModel;
    }

    public CharacterModel getCharModel() {
        return charModel;
    }

    public void setCharModel(CharacterModel cardModel) {
        this.charModel = charModel;
    }
}
