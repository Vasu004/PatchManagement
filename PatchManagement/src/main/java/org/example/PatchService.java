package org.example;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PatchService {
    private List<Patch> patches = new ArrayList<>();
    private int nextPatchIndex = 0;

    public PatchService() {
        patches.add(new Patch("1", "Patch 1 Deployed"));
        patches.add(new Patch("2", "Patch 2 Deployed"));
        patches.add(new Patch("3", "Patch 3 Deployed"));
        patches.add(new Patch("4", "Patch 4 Deployed"));
        patches.add(new Patch("5", "Patch 5 Deployed"));
        patches.add(new Patch("6", "Patch 6 Deployed"));
        patches.add(new Patch("7", "Patch 7 Deployed"));
        patches.add(new Patch("8", "Patch 8 Deployed"));
        patches.add(new Patch("9", "Patch 9 Deployed"));
        patches.add(new Patch("10", "Patch 10 Deployed"));
    }

    public List<Patch> getAllPatches() {
        return patches;
    }

    public String applyNextPatch() {
        if (nextPatchIndex < patches.size()) {
            Patch patch = patches.get(nextPatchIndex);
            nextPatchIndex++;
            return "Patch " + patch.getId() + " with description \"" + patch.getDescription() + "\" applied successfully!";
        } else {
            return "All patches have been applied.";
        }
    }
}
