package grails.chain.select

class SubCategory {

    static belongsTo = Category
    Category category
    String name
    public String toString() {
        return name
    }
}
