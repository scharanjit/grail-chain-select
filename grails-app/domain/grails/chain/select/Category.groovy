package grails.chain.select

class Category {

    static hasMany = [subCategories:SubCategory]
    String name
    public String toString() {
        return name
    }
}
