package com.company;

import java.util.ArrayList;

public class Recipe implements Operation{
    ArrayList <Product> ingredients=new ArrayList<>();
    ArrayList <Integer> weight=new ArrayList<>();

    public Recipe(Product ingredients, int weight) {
        this.ingredients.add(ingredients);
        this.weight.add(weight);
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<ingredients.size();i++){
            sb.append(ingredients.get(i).name+" "+weight.get(i)+"\n");
        }
        return sb.toString();
     }

    public void add(Product ingredients, int weight) {
        this.ingredients.add(ingredients);
        this.weight.add(weight);
    }

    @Override
    public void execute() {

    }
}
