public class RevisedHistoricalEvent extends HistoricalEvent{
    private String revisedDescription;
    private String citation;

    public RevisedHistoricalEvent() {
        super();
        this.revisedDescription = "None";
        this.citation = "None";
    }
    
    public RevisedHistoricalEvent(String description, Date date, String revisedDescription, String citation) {
        super(description, date);

        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return superString + '\n' + this.revisedDescription + '\n' + this.citation;

    }
    
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!super.equals(other)) {
            return false;
        }

        if (!(other instanceof RevisedHistoricalEvent)) {
            return false;
        }

        RevisedHistoricalEvent event = (RevisedHistoricalEvent)other;

        return this.revisedDescription.equals(event.revisedDescription) && this.citation.equals(event.citation);
    }

    public void teach() {
        System.out.println("\n====================================================");
        System.out.println("REVISED HISTORICAL EVENT:");
        System.out.println("====================================================");
        System.out.println(this.toString());    
    }
}
