package com.example.test.models.statusModels;

import com.example.test.models.CharacterModel;

public abstract class StatusModel {

    CharacterModel characterGeneric;

    public StatusModel(CharacterModel characterGeneric) {
        this.characterGeneric = characterGeneric;
    }

    public CharacterModel getCharacterModel() {
        return characterGeneric;
    }

    public void setCharacterModel(CharacterModel characterGeneric) {
        this.characterGeneric = characterGeneric;
    }

}
