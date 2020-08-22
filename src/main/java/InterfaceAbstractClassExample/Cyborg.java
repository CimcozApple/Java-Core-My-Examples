package InterfaceAbstractClassExample;

 interface Cyborg extends Robot, Robot2{
    
    static void says() {
        System.out.println("I am static in interface Cyborg");
    }
    
    default void goodbay() {
        System.out.println("Goodbay all!");
    }
    
    default void dosmt() {
    }

}
