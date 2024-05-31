package UAP;

public class Tomat extends Tanaman implements Perawatan {
    public Tomat() {
        // super(masaHidup, berbuah, perkembangan);
        super(100, 100, 25);
    }

    @Override
    public void berkembang() {
        if (getLamaHidup() < getMasaHidup()) {
            setLamaHidup(getLamaHidup()+1);
            setProsesBerbuah(getProsesBerbuah() + getPerkembangan());
            if (getProsesBerbuah() >= getBerbuah()) {
                setBuah(getBuah() + 1);
                setProsesBerbuah(getProsesBerbuah() - getBerbuah());
            }
        }
    }

    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() + 5);
    }

    @Override
    public String toString() {
        return "Tomat - " + super.toString();
    }
}