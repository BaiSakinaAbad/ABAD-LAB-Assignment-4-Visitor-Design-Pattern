# ABAD-LAB-Assignment-4-Visitor-Design-Pattern

## Overview
This project implements the **Visitor Design Pattern** to calculate shipping costs for an e-commerce furniture platform. The solution demonstrates how to separate shipping cost calculation logic from furniture classes, enabling flexibility and extensibility without modifying existing furniture classes.

## Problem Statement
In an e-commerce platform selling various furniture types (chairs, tables, sofas, etc.), each furniture type requires unique shipping cost calculations:
- **Chairs**: Lightweight items with a flat shipping rate
- **Tables**: Medium-sized items with area-based shipping costs
- **Sofas**: Bulky items with volume-based shipping costs

## Visitor Design Pattern

The Visitor pattern solves this by separating the shipping cost calculation algorithm from the furniture classes. This follows the **Open/Closed Principle** - the code is open for extension but closed for modification.

## UML DIAGRAM
![alt text](visitorPattern(Lab4).png)