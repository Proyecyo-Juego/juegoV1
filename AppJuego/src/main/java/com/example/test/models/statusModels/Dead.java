package com.example.test.models.statusModels;

import com.example.test.models.CharacterModel;

public class Dead extends StatusModel{

    public Dead (CharacterModel characterGeneric) {
        super(characterGeneric);
        characterGeneric.setHealth(0L);
        characterGeneric.setStatus("Dead");
    }

    @Override
    public CharacterModel getCharacterModel() {
        return characterGeneric;
    }

    @Override
    public void setCharacterModel (CharacterModel characterGeneric) {
        this.characterGeneric = characterGeneric;
        characterGeneric.setHealth(0L);
        characterGeneric.setStatus("Dead");
    }
}
