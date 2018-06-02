export class Quiz {

    quizId: number;
    name: string;
    questions: Question[];
    
}

class Question {

    questionId: number;
    difficulty: number;
    value: string;
    libraryId: number;
    answers: Answers[];

}

class Answers {

    answerId: number;
    isCorrect: boolean;
    value: string;
    questionId: number;
    
}