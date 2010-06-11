class Name implements Comparable <Name> {
    String name;
    Person (String name) { this.name = name; }

    public int compareTo(Name n) {
        return n.name.compareTo(name);
    }
}

/**
Som du ser her implementerer vi Comparable, og vi kan da definere compareTo 
til � sammenligne verdier i objektet. Her vil vi da sammenligne 'name' variabelen, 
S� vi bruker da "compareTo(String);", og vi har da definert "compareTo(Name);" 
som kan brukes p� samme m�te med objekter av Name.