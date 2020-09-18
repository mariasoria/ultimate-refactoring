package replacePrimitiveConstantsWithType;

import java.util.Objects;

public class QualityCalculator {
    private int score = 0;

    public void rateLocation(String quality){
        if (Objects.equals(quality, Quality.Excellent)){
            score += 10;
        }
        if (Objects.equals(quality, Quality.Good)){
            score += 7;
        }
        if (Objects.equals(quality, Quality.Bad)){
            score -= 2;
        }
        if (Objects.equals(quality, Quality.Terrible)){
            score -= 10;
        }
    }

    public void rateFacilities(String quality){
        if (Objects.equals(quality, Quality.Excellent)){
            score += 2;
        }
        if (Objects.equals(quality, Quality.Good)){
            score += 1;
        }
        if (Objects.equals(quality, Quality.Bad)){
            score -= 1;
        }
        if (Objects.equals(quality, Quality.Terrible)){
            score -= 2;
        }
    }

    public int getScore() {
        return score;
    }
}
