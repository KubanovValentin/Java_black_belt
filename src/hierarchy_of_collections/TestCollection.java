package hierarchy_of_collections;

public class TestCollection {
}
//все коллекции происходят из Collection кроме Map
//есть интерфейс Collection а есть класс Collections
class List extends TestCollection{}
class Queue extends TestCollection{}
class Set extends TestCollection{}
class Map{}