void settInnPersonSist ( Person inn ) {
\\ Hvis l i s ta er tom, sett inn objektet f�rst
i f ( personliste == null ) personliste = inn ;
else {
\\ finne siste element i l i s ta
Person p = personliste ;
while (p. nestePerson != null )
p = p. nestePerson ;
\\ her er p. nestePerson==null , alts� er p siste
p. nestePerson = inn
}
}