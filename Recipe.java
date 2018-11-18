
import java.util.ArrayList;

public class Recipe implements Operation{
    ArrayList <StoringItem> ingredients=new ArrayList<>();
    ArrayList <Integer> weights=new ArrayList<>();

    public String toString(){
        StringBuilder sb= new StringBuilder();
        for (int i=0; i<ingredients.size();i++){
            sb.append(ingredients.get(i).getName()+" "+weights.get(i)+"\n");
        }
        return sb.toString();
     }
    @Override
    public void add(StoringItem[] ingredients, int weights[]) {
        for (StoringItem product:ingredients){this.ingredients.add(product);}
        for (int weight:weights){this.weights.add(weight);}
    }

    @Override
    public void execute() {
        //тут идет обращение к базе данных на убавление запасов продуктов
    }
}
