package com.example.test.models.statusModels;

import com.example.test.models.CharacterModel;

public class Debilitado extends StatusModel {

    CharacterModel charModel;

    public Debilitado(CharacterModel charModel) {
        super(charModel);
        charModel.setDamage(charModel.getDamage() - 1);
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
