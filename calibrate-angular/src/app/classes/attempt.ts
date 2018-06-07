import { Question } from './question';

export class Attempt {

    quizId: number;
    name: string;
    questions: Question[];
    createdData: number;
    numberOfQuestions: number;
    numCorrect: number;

}