package com.example.test.models.statusModels;

import com.example.test.models.CharacterModel;

public class Wounded extends StatusModel {

    public Wounded (CharacterModel characterGeneric) {
        super(characterGeneric);
        characterGeneric.setStatus("Wounded");
    }

    @Override
    public CharacterModel getCharacterModel() {
        return characterGeneric;
    }

    @Override
    public void setCharacterModel(CharacterModel characterGeneric) {
        this.characterGeneric = characterGeneric;
        characterGeneric.setStatus("Wounded");
    }

}
