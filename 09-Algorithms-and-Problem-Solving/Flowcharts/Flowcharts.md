# Flowcharts

## Overview

A flowchart is a graphical representation of an algorithm. It uses standard symbols connected by arrows to show the sequence of steps in a solution.

Flowcharts help you plan a program before writing Java code. They make it easier to understand the order of instructions, identify decisions and follow the possible paths through an algorithm.

In Grade 10 Information Technology, flowcharts are useful for representing input, processing, output, selection and repetition.

**The main purpose of a flowchart is to show how an algorithm works visually, from its starting point to its conclusion.**

---

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what a flowchart is and why it is used.
- Identify common flowchart symbols.
- Explain the purpose of each symbol.
- Represent input, processing and output using flowcharts.
- Represent decisions using decision symbols.
- Show the sequence of steps using arrows.
- Trace a flowchart to determine its output.
- Translate a flowchart into Java code.
- Identify logical errors in a flowchart.

---

## 1. What Is a Flowchart?

A flowchart uses shapes and arrows to represent the steps of an algorithm.

Each shape has a particular meaning. Arrows show the direction in which the algorithm proceeds.

For example, a simple algorithm that adds two numbers can be represented as:

<box border radius="lg" padding={3} gap={2} align="center">
  <box border={{size:1,color:"#64748b"}} radius="full" padding={{x:5,y:2}} align="center" width="150px">
    **START**
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="md" padding={3} align="center" width="190px">
    **INPUT**

    <text size="sm">number1, number2</text>
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="md" padding={3} align="center" width="190px">
    **PROCESS**

    <text size="sm">sum = number1 + number2</text>
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="md" padding={3} align="center" width="190px">
    **OUTPUT**

    <text size="sm">sum</text>
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="full" padding={{x:5,y:2}} align="center" width="150px">
    **STOP**
  </box>
</box>

This diagram shows the sequence of operations required to solve the problem.

The algorithm begins, receives two numbers, calculates their sum, displays the answer and ends.

---

## 2. Common Flowchart Symbols

You should recognise the common symbols used to represent different operations.

<box gap={3}>
  <row align="center" gap={3}>
    <box width="112px" align="center" gap={1}>
      <box border={{size:1,color:"#64748b"}} radius="full" padding={{x:3,y:2}} width="100px" align="center">
        <text weight="medium" size="sm">START/STOP</text>
      </box>
    </box>
    <box flex="1" gap={1}>
      **Terminator**

      Represents the beginning or end of an algorithm.
    </box>
  </row>
  <divider color="subtle" />
  <row align="center" gap={3}>
    <box width="112px" align="center">
      <box border={{size:1,color:"#64748b"}} radius="md" padding={2} width="100px" align="center">
        <text weight="medium" size="sm">PROCESS</text>
      </box>
    </box>
    <box flex="1" gap={1}>
      **Process**

      Represents an instruction, calculation or assignment.
    </box>
  </row>
  <divider color="subtle" />
  <row align="center" gap={3}>
    <box width="112px" align="center">
      <box border={{size:1,color:"#64748b"}} radius="md" padding={2} width="100px" align="center">
        <text weight="medium" size="sm">INPUT/OUTPUT</text>
      </box>
    </box>
    <box flex="1" gap={1}>
      **Input/output**

      Represents obtaining information or displaying a result. The standard symbol is a parallelogram.
    </box>
  </row>
  <divider color="subtle" />
  <row align="center" gap={3}>
    <box width="112px" align="center">
      <svg viewBox="0 0 112 70" width="112px" height="70px">
        <polygon points="56,3 108,35 56,67 4,35" fill="none" stroke="#64748b" strokeWidth="1.5"/>
        <text x="56" y="39" fontSize="10" textAnchor="middle" fill="currentColor">DECISION</text>
      </svg>
    </box>
    <box flex="1" gap={1}>
      **Decision**

      Represents a condition that determines which path the algorithm follows, usually labelled **Yes/No** or **True/False**.
    </box>
  </row>
  <divider color="subtle" />
  <row align="center" gap={3}>
    <box width="112px" align="center">
      <box border={{size:1,color:"#64748b"}} padding={2} width="100px" align="center">
        <text weight="medium" size="sm">ARROW</text>
      </box>
    </box>
    <box flex="1" gap={1}>
      **Flow line**

      Shows the direction in which the algorithm proceeds.
    </box>
  </row>
</box>

### Important symbol distinctions

- A terminator is normally drawn as an oval or rounded shape.
- A process is represented by a rectangle.
- Input and output use a parallelogram in standard flowchart notation.
- A decision uses a diamond.
- Arrows connect the symbols and indicate the sequence of operations.

When drawing flowcharts for an assessment, use the standard symbols required by your teacher or examination instructions.

---

## 3. Flowcharts for Input, Processing and Output

A simple algorithm usually includes input, processing and output.

Consider a program that calculates the total cost of an order.

### Problem analysis

- **Input:** Price and quantity.
- **Processing:** Multiply price by quantity.
- **Output:** Total cost.

### Flowchart

<box border radius="lg" padding={3} gap={2} align="center">
  <box border={{size:1,color:"#64748b"}} radius="full" padding={2} width="140px" align="center">
    START
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="md" padding={3} width="210px" align="center">
    INPUT price, quantity
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="md" padding={3} width="210px" align="center">
    total = price × quantity
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="md" padding={3} width="210px" align="center">
    OUTPUT total
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="full" padding={2} width="140px" align="center">
    STOP
  </box>
</box>

The flowchart follows the same logic as the equivalent pseudocode:

```text id="f2d0wr"
START
    INPUT price
    INPUT quantity
    total = price * quantity
    OUTPUT total
STOP
```

---

## 4. Representing Decisions in Flowcharts

A decision is represented by a diamond. The condition is written inside the diamond, and the outgoing arrows represent the possible outcomes.

Consider a program that determines whether a student has passed.

The condition is:

```java id="0ntq4g"
mark >= 50
```

If the condition is true, the program displays `Pass`. Otherwise, it displays `Not yet passed`.

### Flowchart

<box border radius="lg" padding={3} gap={2} align="center">
  <box border={{size:1,color:"#64748b"}} radius="full" padding={2} width="130px" align="center">
    START
  </box>
  <icon name="arrow-down" size="lg" />
  <box border={{size:1,color:"#64748b"}} radius="md" padding={2} width="190px" align="center">
    INPUT mark
  </box>
  <icon name="arrow-down" size="lg" />
  <svg viewBox="0 0 240 100" width="240px" height="100px">
    <polygon points="120,4 236,50 120,96 4,50" fill="none" stroke="#64748b" strokeWidth="1.5"/>
    <text x="120" y="54" fontSize="12" textAnchor="middle" fill="currentColor">mark &gt;= 50?</text>
  </svg>
  <grid columns={2} gap={3}>
    <grid-item>
      <box align="center" gap={1}>
        <text weight="medium" color="#16a34a">Yes</text>
        <icon name="arrow-down" size="lg" />
        <box border={{size:1,color:"#64748b"}} radius="md" padding={2} align="center" width="100%">
          OUTPUT "Pass"
        </box>
      </box>
    </grid-item>
    <grid-item>
      <box align="center" gap={1}>
        <text weight="medium" color="#dc2626">No</text>
        <icon name="arrow-down" size="lg" />
        <box border={{size:1,color:"#64748b"}} radius="md" padding={2} align="center" width="100%">
          OUTPUT "Not yet passed"
        </box>
      </box>
    </grid-item>
  </grid>
  <text color="secondary" size="sm">Both paths continue to the end of the algorithm.</text>
  <box border={{size:1,color:"#64748b"}} radius="full" padding={2} width="130px" align="center">
    STOP
  </box>
</box>

### Understanding the decision

The diamond asks whether `mark >= 50` is true.

- If the mark is `65`, the condition is true and the algorithm follows the Yes path.
- If the mark is `40`, the condition is false and the algorithm follows the No path.
- If the mark is exactly `50`, the condition is also true.

The last example is important because `>=` includes values equal to 50.

---

## 5. Translating a Flowchart into Java

A flowchart describes the algorithm visually. Java code implements that algorithm using statements and syntax.

Consider the pass-checking problem.

```java id="f4n0zx"
import javax.swing.JOptionPane;

public class PassChecker
{
    public static void main(String[] args)
    {
        int mark;
        String result;

        mark = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the mark:")
        );

        if (mark >= 50)
        {
            result = "Pass";
        }
        else
        {
            result = "Not yet passed";
        }

        JOptionPane.showMessageDialog(
            null,
            result
        );
    }
}
```

The Java program follows the flowchart:

1. Start the program.
2. Obtain the mark.
3. Evaluate the condition.
4. Follow the correct branch.
5. Display the result.
6. End the program.

When translating a flowchart, make sure each symbol has a corresponding instruction or control structure in your Java code.

---

## 6. Flowcharts for Repetition

Flowcharts can also represent loops. A loop repeats instructions while a condition allows it to continue.

Consider a program that displays the numbers from 1 to 5.

The algorithm needs to:

1. Initialise a counter.
2. Check whether the counter is at most 5.
3. Display the counter if the condition is true.
4. Increase the counter.
5. Return to the condition.
6. Stop when the condition is false.

### Pseudocode

```text id="v8s6ya"
START
    count = 1

    WHILE count <= 5
        OUTPUT count
        count = count + 1
    ENDWHILE

STOP
```

### Equivalent Java code

```java id="7w9jmn"
public class CountingExample
{
    public static void main(String[] args)
    {
        int count;

        count = 1;

        while (count <= 5)
        {
            System.out.println(count);

            count = count + 1;
        }
    }
}
```

**Output:**

```text id="d9b1xa"
1
2
3
4
5
```

### What should the flowchart show?

- A process box that initialises `count` to 1.
- A decision diamond that checks `count <= 5`.
- An output parallelogram that displays `count`.
- A process box that increases `count` by 1.
- An arrow that returns to the decision.
- An exit path when the condition becomes false.

A loop flowchart must include the return path. Without it, the diagram would not represent repetition correctly.

---

## 7. Tracing a Flowchart

Tracing means following the algorithm step by step to determine the values of variables and the resulting output.

Consider the counting algorithm above.

| Step | Value of `count` | Condition `count <= 5` | Action |
|---|---:|---|---|
| 1 | 1 | True | Display 1 |
| 2 | 2 | True | Display 2 |
| 3 | 3 | True | Display 3 |
| 4 | 4 | True | Display 4 |
| 5 | 5 | True | Display 5 |
| 6 | 6 | False | Stop repeating |

The counter becomes 6 after the final increment. The next condition check is false, so the loop ends.

### Why is tracing useful?

- It helps you predict program output.
- It reveals incorrect conditions.
- It helps identify missing increments.
- It makes infinite loops easier to recognise.
- It allows you to verify the algorithm before coding.

---

## 8. Common Flowchart Errors

| Mistake | Why it is a problem | How to correct it |
|---|---|---|
| Using a rectangle for a decision | The symbol does not clearly represent a condition. | Use a diamond. |
| Forgetting an input step | The algorithm may use information it has not obtained. | Add an input/output parallelogram. |
| Omitting an output step | The required result may never be displayed. | Include an output symbol. |
| Leaving decision branches unlabeled | It may be unclear which path represents each result. | Label branches Yes/No or True/False. |
| Missing the return arrow in a loop | The diagram does not correctly show repetition. | Connect the loop body back to its condition. |
| Forgetting to initialise a counter | The algorithm may not work as intended. | Add an initialisation process before the loop. |
| Using the wrong condition | The algorithm may repeat too many or too few times. | Check the boundary values and trace the flowchart. |

---

## 9. Practical Challenge

Create a flowchart for a program that calculates a student's average from two marks and determines whether the average is at least 50%.

### Requirements

Your flowchart must include:

1. A Start symbol.
2. Input for the two marks.
3. A process that calculates the average.
4. A decision that checks whether the average is at least 50.
5. An output for each possible result.
6. A Stop symbol.

### Extension challenge

Create a flowchart for a program that calculates a shopping total and applies a 10% discount if the total exceeds R500.

The flowchart must:

- Obtain the price and quantity.
- Calculate the original total.
- Check whether the total exceeds R500.
- Calculate the discount when appropriate.
- Calculate the final amount.
- Display the final amount.

Trace the flowchart using totals below, exactly equal to and above R500.

---

## 10. Key Takeaways

- A flowchart is a graphical representation of an algorithm.
- Standard symbols represent different types of operations.
- Arrows show the direction of execution.
- Rectangles represent processing.
- Parallelograms represent input and output.
- Diamonds represent decisions.
- Flowcharts can represent sequence, selection and repetition.
- Tracing helps you understand how an algorithm executes.
- Flowcharts can be translated into pseudocode and Java.
- Correct symbols, conditions and arrows make a flowchart easier to understand.

---

## Navigation

- **Previous topic:** [Pseudocode](../Pseudocode/README.md)
- **Next topic:** [Common Algorithmic Tasks](../Common-Algorithmic-Tasks/README.md)
- **Back to Algorithms and Problem-Solving:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
