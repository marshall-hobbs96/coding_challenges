// vowels: a e i o u

function getAllSubstrings(str) {

    let i; 
    let j; 
    let allSubStrings = []; 

    for(i = 0; i < str.length; i++) {

        for(j = 0; j < str.length; j++) {

            if(j >= i) {

                allSubStrings.push(str.slice(i, j + 1));

            }

        }

    }

    return allSubStrings;

}

function getAllUniqueElements(elements) {

    let i;
    let j; 

    for(i = 0; i < elements.length; i++) {

        let numOccurances = 0; 

        for(j = 0; j < elements.length; j++) {

            if(elements[i] == elements[j]) {

                numOccurances++; 

                if(numOccurances > 1) {

                    elements.splice(j, 1);

                }

            }

        }

    }

    return elements; 

}

function testStartEndWithVowel(str) {

    let startAndEndWithVowel = false; 

    switch(str[0]) {

        case 'a':
            startAndEndWithVowel = true; 
            break;

        case 'e':
            startAndEndWithVowel = true; 
            break;

        case 'i':
            startAndEndWithVowel = true; 
            break;

        case 'o':
            startAndEndWithVowel = true;
            break;

        case 'u':
            startAndEndWithVowel = true;
            break;

        default: 
            startAndEndWithVowel = false; 

    }

    switch(str[str.length - 1]) {

        case 'a':
            break;

        case 'e':
            break;

        case 'i':
            break;

        case 'o':
            break;

        case 'u':
            break;

        default: 
            startAndEndWithVowel = false; 

    }

    return startAndEndWithVowel;

}

function testStartEndWithConst(str) {

    let startAndEndWIthConsonant = true; 

    switch(str[0]) {

        case 'a':
            startAndEndWIthConsonant = false; 
            break;

        case 'e':
            startAndEndWIthConsonant = false; 
            break;

        case 'i':
            startAndEndWIthConsonant = false; 
            break;

        case 'o':
            startAndEndWIthConsonant = false;
            break;

        case 'u':
            startAndEndWIthConsonant = false;
            break;

        default: 
        startAndEndWIthConsonant = true; 

    }

    switch(str[str.length - 1]) {

        case 'a':
            startAndEndWIthConsonant = false;
            break;

        case 'e':
            startAndEndWIthConsonant = false;
            break;

        case 'i':
            startAndEndWIthConsonant = false;
            break;

        case 'o':
            startAndEndWIthConsonant = false;
            break;

        case 'u':
            startAndEndWIthConsonant = false;
            break;
 

    }
    return startAndEndWIthConsonant;

}

let uniqueStrings = getAllUniqueElements(getAllSubstrings("Hello"));

let i = 0; 

for(i = 0; i < uniqueStrings.length; i ++) {

    console.log(uniqueStrings[i] + " " + testStartEndWithConst(uniqueStrings[i]) + " " + testStartEndWithVowel(uniqueStrings[i]));

}

let stringToPrint; 

function anotherFunction() {


    console.log(stringToPrint);

}

function redundant(str) {

    stringToPrint = str; 
    return anotherFunction; 

}

redundant("hello")();
