public class Ticket implements Comparable<Ticket> {

    @Override
    public int compareTo(Ticket o) {
        return 0;
        //bisogna associare una priorità
    }
    private String id;
    private String descrizione;
    private String livello;
    private long timestampArrivo;

    public Ticket(String id, String descrizione, String livello, long timestampArrivo) {
        this.id = id;
        this.descrizione = descrizione;
        this.livello = livello;
        this.timestampArrivo = timestampArrivo;
    }
}