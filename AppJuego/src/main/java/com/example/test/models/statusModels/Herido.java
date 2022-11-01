package com.example.test.models.statusModels;

import com.example.test.models.CharacterModel;

public class Herido extends StatusModel{
    CharacterModel charModel;

    public Herido(CharacterModel charModel) {
        super(charModel);
        charModel.setHealth(charModel.getHealth() - 1);
    }

    @Override
    public CharacterModel getCharModel() {
        return charModel;
    }

    @Override
    public void setCharModel(CharacterModel charModel) {
        this.charModel = charModel;
        charModel.setDamage(charModel.getDamage() - 1);
    }
}

