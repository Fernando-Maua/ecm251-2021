package kon.laiser.fernando.maps;

import kon.laiser.fernando.models.Item;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTestDrive {
    public static void main(String[] args) {
        Map<String, Item> itemMap = new LinkedHashMap<>();

        //Insere elementos no mapa
        itemMap.put("Item1", new Item("maca",1));
        itemMap.put("Item2", new Item("pera",2));
        itemMap.put("Item3", new Item("maca",1));
        itemMap.put("Item4", new Item("banana",3));

        itemMap.forEach((chave, valor) -> System.out.println("Chave:"+ chave + "\tValor:" + valor));

        System.out.println(itemMap);

        //Manipulação dos valores dentro do Map
        Item item = itemMap.get("Item2");
        System.out.println(item);
        item = itemMap.get("Goku");
        System.out.println(item);
        item = itemMap.getOrDefault("item10", new Item("Vegeta",7999));
        System.out.println(item);
    }
}
