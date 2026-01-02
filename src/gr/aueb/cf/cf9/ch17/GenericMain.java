package gr.aueb.cf.cf9.ch17;

public class GenericMain {
    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Integer> doubleNode = new GenericNode<>();   // στα generics,Οχι Primitives ως παραμετρικοί τύποι
        var intNode = new GenericNode<>()

        doubleNode.setValue(10.5);
        strNode.setValue("Hello");
    }
}
