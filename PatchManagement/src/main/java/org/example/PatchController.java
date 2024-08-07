package org.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatchController {
    private final PatchService patchService;

    @Autowired
    public PatchController(PatchService patchService) {
        this.patchService = patchService;
    }

    @GetMapping("/patches")
    public List<Patch> getAllPatches() {
        return patchService.getAllPatches();
    }

    @PostMapping("/patches/apply")
    public String applyNextPatch() {
        return patchService.applyNextPatch();
    }
}
