package enumeraciones.ejemplo;

public enum Continentes {

    AFRICA(55),
    EUROPA(44),
    ASIA(33),
    AMERICA(22),
    OCEANIA(11);

    private final int paises;

    Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
    
}
