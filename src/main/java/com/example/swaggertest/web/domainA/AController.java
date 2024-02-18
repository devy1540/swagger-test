package com.example.swaggertest.web.domainA;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("A")
@Tag(name= "A컨트롤러", description = "A컨트롤러 입니다.")
@Slf4j
public class AController {


    @GetMapping("01")
    public ResponseEntity<String> getA01() {
        log.info("call getA01");
        return ResponseEntity.ok("getA01");
    }

    @PostMapping("02")
    public ResponseEntity<String> postA02() {
        log.info("call postA02");
        return ResponseEntity.ok("postA02");
    }

    @PatchMapping("03")
    public ResponseEntity<String> patchA03() {
        log.info("call patchA03");
        return ResponseEntity.ok("patchA03");
    }


    @DeleteMapping("04")
    public ResponseEntity<String> deleteA04() {
        log.info("call deleteA04");
        return ResponseEntity.ok("deleteA04");
    }

    @Operation(summary = "5번째 메소드", description = "5번째로 만든 Get 메소드")
    @GetMapping("05")
    public ResponseEntity<String> getA05(
            @Parameter(name = "str", description = "문자열", example = "test-str") String str
    ) {
        log.info("call getA05");
        return ResponseEntity.ok(str);
    }

    @GetMapping("06")
    public ResponseEntity<String> getA06(
            @RequestParam("arr")
            @Parameter(name = "arr", description = "String 배열", example = "[\"test-arr\", \"test-arr2\"]")
            String[] arr
    ) {
        log.info("call getA06");
        return ResponseEntity.ok(Arrays.toString(arr));
    }

    @GetMapping("07")
    public ResponseEntity<List<String>> getA07(
            @RequestParam(value = "list", defaultValue = "default-value")
            @Parameter(name = "list", description = "Collection 구조 리스트", example = "1,2")
            List<String> list
    ) {
        log.info("call getA07");
        return ResponseEntity.ok(list);
    }
}
