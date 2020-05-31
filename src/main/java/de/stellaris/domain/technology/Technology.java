package de.stellaris.domain.technology;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

@Data
@Setter(AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode
@Builder
public class Technology {

  @Builder.Default
  private String id = "";
  private double cost;
  private double tier;
  @Builder.Default
  private String category = "";
  private double levels;
  private double costPerLevel;
  @Singular
  private List<String> prerequisites;
  private double weight;
  @Builder.Default
  private String gateway = "";
  @Builder.Default
  private String aiUpdateType = "";
  private boolean startTech;
  @Singular
  private List<String> featureFlags;
  @Builder.Default
  private String area = "";
  private boolean dangerous;
  private boolean rare;
  // TODO: modifier
  // TODO: prereqfor_desc
  // TODO: potential
  // TODO: weight_modifier
  // TODO: ai_weight
  // TODO: weight_groups
  // TODO: mod_weight_if_group_picked
}
