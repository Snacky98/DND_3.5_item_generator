/* @author : Nicholas Ziegelr
* this is an object that will hold all the data for each individual item, whether it's generated or read inn
* fields:
* name - the name of the item
* type - what type of item the item is
* subType - what the item's subtype is
* desc - will usually be a string that gives what book the item is from and what page it is found on */

package generator;

public class Item {
    private static String name;
    private static ItemType type;
    private static ItemSubtype subType;
    private static String desc;


    /* basic constructor */
    public Item(String name, ItemType type, ItemSubtype subType, String desc){
        this.name = name;
        this.type = type;
        this.subType = subType;
        this.desc = desc;
    }

    /* getters */
    public String getName(){
        return this.name;
    }

    public ItemType getType(){
        return this.type;
    }

    public ItemSubtype getSubType() {
        return this.subType;
    }

    public String getDesc(){
        return this.desc;
    }

    /* setters (likely won't be used much) */
    public void setName(String name){
        this.name = name;
    }

    public void setType(ItemType type){
        this.type = type;
    }

    public void setSubType(ItemSubtype subType){
        this.subType = subType;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }
}
