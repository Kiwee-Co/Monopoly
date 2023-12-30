package exercise.kiwee.game.gamer;

import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Player {
    private static final int STARTING_FUND = 2000;
    
    private String name;
    private PlayerStatus status;
    
    private int fund;
    private int position;
    
    public Player(String name) {
        this.name = name;
        this.position = 0;
        this.fund = STARTING_FUND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerStatus getStatus() {
        return status;
    }

    public void setStatus(PlayerStatus status) {
        this.status = status;
    }

    public int getFund() {
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Player other = (Player) obj;

        return new EqualsBuilder().append(this.name, other.name).append(this.status, other.status).append(this.fund, fund).append(this.position, position).isEquals();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name).append("status", status)
                .append("fund", fund).append("position", position).toString();
    }

    public enum PlayerStatus {
        NORMAL, JAIL
    }
}
