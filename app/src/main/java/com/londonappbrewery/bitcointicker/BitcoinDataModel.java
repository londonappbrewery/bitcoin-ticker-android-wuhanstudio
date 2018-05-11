package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    public double getPrice() {
        return price;
    }

    private double price;

    // TODO: Create a BitcoinDataModel from a JSON:
    public static BitcoinDataModel fromJson(JSONObject jsonObject) {
        try{
            BitcoinDataModel bitcoinData  = new BitcoinDataModel();
            bitcoinData.price = jsonObject.getDouble("ask");

            return bitcoinData;
        } catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }
}
