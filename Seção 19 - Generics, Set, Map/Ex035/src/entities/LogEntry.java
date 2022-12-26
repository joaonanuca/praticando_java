package entities;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author joaon
 */
public class LogEntry {
    
    private String username;
    private Date moment;
    
    public LogEntry(){
    }

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LogEntry other = (LogEntry) obj;
        return Objects.equals(this.username, other.username);
    }
    
}
