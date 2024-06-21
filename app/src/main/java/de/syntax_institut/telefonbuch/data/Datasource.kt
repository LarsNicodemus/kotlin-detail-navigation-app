package de.syntax_institut.telefonbuch.data

import de.syntax_institut.telefonbuch.data.model.Contact

/**
 * Diese Klasse bereitet die Informationen vor
 */
class Datasource {

    /**
     * Diese Funktion liefert eine Liste von Contact Objekten zurück,
     * in denen die Namen und die Telefonnummern gespeichert sind
     */
    fun loadContacts(): MutableList<Contact> {
        return mutableListOf(
            Contact("Lionel Messi", "+49 1595 9367862"),
            Contact("Cristiano Ronaldo", "+49 15047 284702"),
            Contact("Franz Beckenbauer", "+49 1598 7361226"),
            Contact("Pelé", "+49 1513 5007043"),
            Contact("Lothar Matthäus", "+49 15596 033203"),
            Contact("Paul Breitner", "+49 15027 785378"),
            Contact("Neymar", "+49 15574 793889"),
            Contact("Bastian Schweinsteiger", "+49 163 55846780"),
            Contact("Luis Suárez", "+49 15655 478518"),
            Contact("Diego Maradona", "+49 15868 293585"),
            Contact("Sergio Ramos", "+49 1526 6618426"),
            Contact("Robert Lewandowski", "+49 162 6334069"),
            Contact("Philipp Lahm", "+49 15880 654128"),
            Contact("Mesut Özil", "+49 172 32469523"),
            Contact("Marco Reus", "+49 1521 3291920"),
            Contact("Manuel Neuer", "+49 1577 5161260"),
            Contact("Zinédine Zidane", "+49 162 7285734"),
            Contact("Thomas Müller", "+49 15818 559583"),
            Contact("Toni Kroos", "+49 162 6544672"),
            Contact("Mats Hummels", "+49 173 30423354")
        )
    }
}
